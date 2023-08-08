public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79005554433", "Андрей");
        res = hashMap.put("+79990000000", "Анна");
        res = hashMap.put("+79991111111", "Алексей");
        res = hashMap.put("+79992222222", "Денис");
        res = hashMap.put("+79993333333", "Юля");
        res = hashMap.put("+79994444444", "Светлана");
        res = hashMap.put("+79995555555", "Олег");


        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }

    }

}
