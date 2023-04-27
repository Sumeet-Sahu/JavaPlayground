package designpatterns;

import java.util.function.Consumer;

public class ExecuteAroundPattern {


    public static void main(String[] args) {
        Resource resource = new Resource();
        resource.op1();
        resource.op2();

        System.gc(); // This might also not call finalize method

        try {
            Resource resource1 = new Resource();
            resource1.op1();
            resource1.op2();

        } finally {
            resource.clean();
        }

        // After implementing AutoClosable
        // ARM : Automatic Resource Management
        try (Resource resource2 = new Resource()){
            resource2.op1();
            resource2.op2();
        }

        // TODO: Make constructor of resource class private

        // Below code will handle the cleanup without calling clean method explicitly. It is handled in the pattern itself

        Resource.use(resourcex -> resourcex.op1()
                .op2());
    }
}

class Resource implements AutoCloseable{
    public Resource() {
        System.out.println("Created....");
    }

    public Resource op1(){
        System.out.println("Op1...");
        return this;
    }

    public Resource op2(){
        System.out.println("Op2...");
        return this;
    }

    public void finalize() {
        System.out.println("Releasing external resources...");
    }

    public void clean() {
        System.out.println("Releasing external resources...CLEAN");
    }
    public void close() {
        System.out.println("Releasing external resources...CLOSE");
    }

    public static void use(Consumer<Resource> block) {
        Resource resource = new Resource();

        try {
            block.accept(resource);
        } finally {
            resource.clean();
        }
    }
}
