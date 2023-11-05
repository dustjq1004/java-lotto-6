package lotto;

import java.util.ArrayList;
import java.util.List;
import lotto.model.Lotto;

public class LottoStore {

    private static final int ROTTO_PRICE = 1000;
    private NumberGenerator numberGenerator;

    public LottoStore(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public List<Lotto> purchaseLottoNumbers(int money) {
        int quantity = calculateLottoNumberByMoney(money);
        return createLottoNumbers(quantity);
    }
    public List<Lotto> createLottoNumbers(int quantity) {
        List<Lotto> lottos = new ArrayList<>();
        int lottoCount = 0;
        while (lottoCount < quantity) {
            Lotto lotto = new Lotto(numberGenerator.createSixDigitNumber());
            lottos.add(lotto);
        }
        return lottos;
    }

    public int calculateLottoNumberByMoney(int money) {
//        validate(money);
        return money / ROTTO_PRICE;
    }


}
