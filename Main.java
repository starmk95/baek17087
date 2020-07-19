import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);;
        int n = sc.nextInt(); // 동생 n명
        int s = sc.nextInt(); // 수빈의 위치 = s

        int[] distance = new int[n]; // 수빈과 동생과의 거리 모음

        // 동생 n명과 수빈과의 거리들의 최대공약수를 구하면 D의 최대값이 된다.
        for (int i=0;i<n;i++) { // 거리 입력 반복문
            int position = sc.nextInt();
            distance[i] = Math.abs(s-position); // Math.abs : 절대값 구하는 메소드
        }
        int answer = distance[0];
        for (int i=1;i<n;i++) {
            answer = gcd(answer, distance[i]);
        }
        System.out.println(answer);
    }

    public static int gcd(int a, int b) { // 유클리드 호제법을 사용한 최대공약수 구하기
        while (b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
