package atividade7;

import java.time.LocalDateTime;

public class MsgLogin {

	public void retornaMensagem(LocalDateTime data) {
		if(data.getHour()>=6 && data.getHour()<12)
			System.out.println("Bom dia,voc� se logou ao nosso sistema");
		else if(data.getHour()>=12 && data.getHour()<18)
			System.out.println("Boa tarde,voc� se logou ao nosso sistema");
		else if(data.getHour()>=18 && data.getHour()<00)
			System.out.println("Boa noite,voc� se logou ao nosso sistema");
		else
			System.out.println("Boa madrugada,voc� se logou ao nosso sistema");
		
	}
}
