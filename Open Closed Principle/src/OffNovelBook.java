public class OffNovelBook extends NovelBook {

    public OffNovelBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    public int getPrice() {
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if(selfPrice > 4000){
            offPrice = selfPrice * 90/100;
        }else{
            offPrice = selfPrice * 80/100;
        }
        return offPrice;
    }

}
