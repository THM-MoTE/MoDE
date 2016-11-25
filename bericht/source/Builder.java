# tag::withLombok[]
import lombok.Builder;
import lombok.Singular;
import java.util.Set;

@Builder
public class BuilderExample {
  private String name;
  @Singular private Set<String> occupations;
}
# end::withLombok[]

# tag::withoutLombok[]
import java.util.Set;

public class BuilderExample {
 private String name;
 private Set<String> occupations;

 BuilderExample(String name, Set<String> occupations) {
   this.name = name;
   this.occupations = occupations;
 }

 public static BuilderExampleBuilder builder() {
   return new BuilderExampleBuilder();
 }

 public static class BuilderExampleBuilder {
   private String name;
   private java.util.ArrayList<String> occupations;

   BuilderExampleBuilder() {
   }

   public BuilderExampleBuilder name(String name) {
     this.name = name;
     return this;
   }

   public BuilderExampleBuilder occupation(String occupation) {
     if (this.occupations == null) {
       this.occupations = new java.util.ArrayList<String>();
     }

     this.occupations.add(occupation);
     return this;
   }
   
   ...

   public BuilderExample build() {
     // complicated switch statement to produce a compact properly sized immutable set omitted.
     // go to https://projectlombok.org/features/Singular-snippet.html to see it.
     Set<String> occupations = ...;
     return new BuilderExample(name, age, occupations);
   }
  }
}
# end::withoutLombok[]
