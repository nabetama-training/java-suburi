package com.nabetama.bridge.display;

// ConcreteImplementor
public class StringDisplayImpl implements DisplayImpl {

  @Override
  public String rawOpen() {
    return "open";
  }

  @Override
  public String rawPrint() {
    return "print";
  }

  @Override
  public String rawClose() {
    return "close";
  }
}
