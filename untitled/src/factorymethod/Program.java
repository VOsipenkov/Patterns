package factorymethod;

public class Program {
    public static void main(String[] args) {
        var developerFactory = developerFactory("Java");
        var developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory developerFactory(String type) {
        if (type == null || type.trim().equals("")) {
            throw new RuntimeException("Тип фабрики не может быть пустым..");
        }
        if (type.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (type.equalsIgnoreCase("cpp") || type.equalsIgnoreCase("c++")
                || type.equalsIgnoreCase("c ++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException("Тип фабрики неизвестен");
        }
    }
}
