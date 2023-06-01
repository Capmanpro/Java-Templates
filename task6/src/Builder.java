import java.util.Set;

//Паттерн «Строитель» – разделяет создание объекта на отдельные шаги, а также позволяет использовать один и тот же код создания для получения различных представлений
class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height){
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person> parents){
            newPerson.parents = parents;
            return this;
        }

        public Person build(){
            return newPerson;
        }

    }
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Oleg")
                .withSurname("Novikov")
                .withAge(22)
                .withHeight(188)
                .withWeight(63)
                .build();
    }
}
