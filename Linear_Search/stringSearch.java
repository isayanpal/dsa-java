package Linear_Search;

public class stringSearch {
    public static void main(String[] args) {
        String name = "Sayan";
        char target = 'y';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target){
        if ( str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
