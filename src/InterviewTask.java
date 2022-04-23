import models.Person;

public class InterviewTask {

    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Юрий")
                .middleName("Алексеевич")
                .lastName("Гагарин")
                .country("СССР")
                .address("Смоленская область, дер.Клушино")
                .age(34)
                .phone("1-11-11")
                .gender("мужской")
                .build();
        System.out.println(person);
    }
}
