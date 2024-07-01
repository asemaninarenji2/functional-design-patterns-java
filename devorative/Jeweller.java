public calss Jeweller {
  private Function<Jewel, Jewel> operation;
  public Jeweller(Function<Jewel, Jewel> operation) {
    this.operation = operation;
  }
  public Jewel make(Jewel baseMetal) {
    this.operation.accept(baseMetal);
  }
}
