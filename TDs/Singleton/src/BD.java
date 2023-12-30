public class BD {
    int id ; String name ;
    private static BD instance;
    private BD(int record, String name) {
        this.id = record;
        this.name = name;
    }

    public static BD getInstance(String name , int record){
        if(instance == null)
            instance = new BD(record , name);
        return instance ;
    }
    public void editRecord(String operation) {
        System.out.println(operation + " operation on id " + id + " in database " + name);
    }
    public String getName() {
        return name;
    }
}
