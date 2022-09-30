
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }




    public int addToner(int tonerAmount) {
        if ((tonerAmount > 0 && tonerAmount <= 100) && (this.tonerLevel + tonerAmount > 100)) {
            return -1;
        } else if ((tonerAmount > 0 && tonerAmount <= 100) && (this.tonerLevel + tonerAmount <= 100)) {
            this.tonerLevel = this.tonerLevel + tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }

    }



    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.duplex) {
            int numDoublePages = pages / 2;
            int numSinglePage = pages % 2;
            pagesToPrint = numDoublePages + numSinglePage;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }



    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
