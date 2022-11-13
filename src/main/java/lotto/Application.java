package lotto;

import lotto.domain.Ticket;
import lotto.template.Input;
import lotto.template.Output;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 구입 금액 입력
        int money = Input.insertMoney();
        Ticket ticket = new Ticket(money);
        // 금액에 따라 로또 수량 및 번호 출력
        Output.showTicket(ticket);
        // 당첨 번호 입력
        List<Integer> winningNumbers = Input.insertWinningNumbers();
        // 보너스 번호 입력
        Input.insertBonusNumber();
        // 당첨 통계 출력
        Output.showWinningStatistics();
    }
}
