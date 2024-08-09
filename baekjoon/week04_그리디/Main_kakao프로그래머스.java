import java.io.*;

public class Main_kakao프로그래머스 {
 public String solution(String new_id) throws IOException {

     //소문자 변환
     String result = new_id.toLowerCase();

     //알파벳 소문자(a-z) 숫자(0-9) 대시(-) 밑줄(_) 마침표(.)을 제외한 모든 문자 제거
     result = result.replaceAll("[^-_.a-z0-9]", "");
     //연속된 (.)를 하나 (.)로 변경
     result = result.replaceAll("\\.{2,}", ".");
     //문자열의 시작과 끝에 있는 (.) 제거
     result = result.replaceAll("^\\.|\\.$", "");

     //문자열이 비어있는 경우 a로 설정
     if(result.isEmpty()){
         result = "a";
     }

     //문자열이 15를 초과하는 경우 나머지 제거
     //문자열이 (.)로 끝나면 제거
     if(result.length() > 15){
         result = result.substring(0, 15);
         if(result.endsWith(".")){
             result = result.substring(0, result.length() - 1);
         }
     }

     //문자열의 길이가 3자 미만인 경우
     //마지막 문자를 반복하여 3자로 만듬
     while(result.length() < 3){
         result += result.charAt(result.length() - 1);
     }

     return result;
 }
}
