# tag::withLombok[]
import lombok.Getter;
import lombok.Setter;

@Getter
public class GetterSetterExample {
  @Setter private int age = 10;
  private String name;
}
# end::withLombok[]

# tag::withoutLombok[]
pubic class GetterSetterExample {
  private int age = 10;
  private String name;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void getName() {
    return name;
  }
}
# end::withoutLombok[]
