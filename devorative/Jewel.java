public class Jewel {
  private String type;
  public Jewel(String type) {
    this.type = type;
  }
  public Jewel ring() {
    this.type = this.type.concate(" ring");
    return this;
  }
  public Jewel bracelate() {
    this.type = this.type.concate(" bracelet");
    return this;
  }
  public Jewel feature() {
    this.type = "featured ".concate(this.type);
    return this;
  }
}
  
