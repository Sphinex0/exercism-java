class Badge {
    public String print(Integer id, String name, String department) {
        if (department == null){
            department = "owner";
        }
        return id == null ? String.format("%s - %s",name,department.toUpperCase()) :String.format("[%d] - %s - %s",id,name,department.toUpperCase());
    }
}
