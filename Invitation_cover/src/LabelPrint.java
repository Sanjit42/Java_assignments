public class LabelPrint {
    private String arg;
    private Person person;

    public LabelPrint(String content) {
        this.arg = content;
    }

    public Person operateData() {
        String[] splittedContent = arg.split("\n");
        for (int i = 0; i < splittedContent.length; i++) {
            String[] eachData = splittedContent[i].split(",");
            Address address = new Address(eachData[4], eachData[5], eachData[6]);
            int age = Integer.parseInt(eachData[3]);
            Name name = new Name(eachData[0], eachData[1]);
            Gender gender = Gender.valueOf(eachData[2]);
            person = new Person(name, gender, age, address);
        }
        return person;
    }
}