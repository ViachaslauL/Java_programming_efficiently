package by.mycompany.java.programming.effeciently.chapter02.builder;

class BuilderTest {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(100, 1)
                .calories(42).fat(0).carbohydrate(10).sodium(10).build();

        System.out.println(cocaCola);
    }
}
