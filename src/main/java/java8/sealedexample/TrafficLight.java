package java8.sealedexample;

public sealed interface TrafficLight { }

final class RedLight implements TrafficLight {}
final class GreenLight implements TrafficLight {}
