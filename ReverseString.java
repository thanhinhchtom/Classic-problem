public class ReverseString {
    public String reverseString(String str){
        String[] splited = str.split(" ");
        String result = splited[splited.length-1];

        for (int i = 1; i < splited.length; i++){
            result = result + " " + splited[splited.length - 1 - i];
        }
        return result;
    }
}
