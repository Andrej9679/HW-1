public class CatClass {
    String name; // Не меньше 3 букв
    int age;   // Возраст кота от 1 до 25 лет
    String sex;
    String ownerName;  // Не меньше 5 букв
    Boolean graft;

    public CatClass(String name, int age, String sex, String ownerName, Boolean graft) {
        validateName(name);
        validateAge(age);
        this.sex = sex;
        validateOwnerName(ownerName);
        this.graft = graft;
    }

    public CatClass(String name, int age, String sex, String ownerName) {
        validateName(name);
        validateAge(age);
        this.sex = sex;
        validateOwnerName(ownerName);
    }

    public CatClass(String name, int age, String ownerName, Boolean graft) {
        validateName(name);
        validateAge(age);
        validateOwnerName(ownerName);
        this.graft = graft;
    }

    public CatClass(String name, int age, String ownerName) {
        validateName(name);
        validateAge(age);
        validateOwnerName(ownerName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAge(age);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        validateOwnerName(ownerName);
    }

    public Boolean getGraft() {
        return graft;
    }

    public void setGraft(Boolean graft) {
        this.graft = graft;
    }

    public void validateName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            name = "DefaultName";
            System.out.println("Too short name");
        }
    }

    public void validateOwnerName(String ownerName) {
        if (ownerName.length() >= 5) {
            this.ownerName = ownerName;
        } else {
            ownerName = "DefaultOwnerName";
            System.out.println("Too short ownerName");
        }
    }

    public void validateAge(int age) {
        if (age > 0 && age <= 25) {
            this.age = age;
        } else {
            this.age = 1;
            // System.out.println("Cat's Age can be between at 1 to 25 years!");
            if (age > 25) {
                this.age = 25;
                //System.out.println("Cat's Age can be between at 1 to 25 years!");
            }
        }
    }

    public String toString() {
        return "Cat's name - " + name +
                ", age - " + age +
                ", sex - " + sex +
                ", graft - " + graft +
                ", ownerName - " + ownerName;
    }
}
