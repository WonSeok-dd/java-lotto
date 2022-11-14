package lotto.util;

public enum WinningInfo {

    FISRTRANK(1,"6개 일치 (2,000,000,000원)", 2_000_000_000 ),
    SECONDRANK(2,"5개 일치, 보너스 볼 일치 (30,000,000원)",30_000_000),
    THIRDRANK(3, "5개 일치 (1,500,000원)", 1_500_000),
    FOURTHRANK(4, "4개 일치 (50,000원)", 50_000),
    FIFTHRANK(5, "3개 일치 (5,000원)", 5_000);

    private final int rank;
    private final String message;
    private final int prize;

    WinningInfo(int rank, String message, int prize) {
        this.rank = rank;
        this.message = message;
        this.prize = prize;
    }

    public int getRank() {
        return rank;
    }

    public String getMessage() {
        return message;
    }

    public int getPrize() {
        return prize;
    }
}