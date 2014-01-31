import java.util.Random;
import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		String input;

		while(true){
			System.out.println("グー = g ： チョキ = c ： パー = p のように入力してください。");
			input = sc.nextLine();
			int uhand=playerSelect(input);
			if(uhand==4) continue;
			int cpu = rnd.nextInt(3);
			System.out.println("コンピューターの出した結果"+cpu(cpu));
			if(uhand==(cpu+1)%3){
				System.out.println("あなたの負けです");
			}else if(uhand==cpu){
				System.out.println("あいこです");
			}else{
				System.out.println("あなたの勝ちです");
			}
		}

	}
	private static int playerSelect(String input){
		String[] hands = {"g","c","p"};
		for(int i=0;i<3;i++){
			if(hands[i].equals(input)){
				return i;
			}else{
				System.out.println("もう一度やり直してください。");
			}

		}
		return 4;
	}
	private static String cpu(int cpu){
		String[] hands={"g","c","p"};
				return hands[cpu];
	}

}
