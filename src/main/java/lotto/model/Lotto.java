package lotto.model;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        Collections.sort(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public int compare(List<Integer> winingLotto) {
        int count = 0;
        for (Integer winingNumber : winingLotto) {
            if (numbers.contains(winingNumber)) {
                count++;
            }
        }
        return count;
    }

    public boolean containBonus(int bonus) {
        return numbers.contains(bonus);
    }

    @Override
    public String toString() {
        return String.valueOf(numbers);
    }

    // TODO: 추가 기능 구현
}
