package d12_09_2023;

public class Agreement {
    private String date;
    private Physical_person buyer;
    private Physical_person seller;

    private double priceOfRealEstate;
    private String realEstateAdress;

    public Agreement () {

    }
    public Agreement (String date, Physical_person buyer, Physical_person seller, double priceOfRealEstate, String realEstateAdress) {
        this.date = date;
        this.buyer = buyer;
        this.seller = seller;
        this.priceOfRealEstate = priceOfRealEstate;
        this.realEstateAdress = realEstateAdress;
    }
    public String getDate() {
        return date;
    }

    public Physical_person getBuyer() {
        return buyer;
    }

    public Physical_person getSeller() {
        return seller;
    }

    public double getPriceOfRealEstate() {
        return priceOfRealEstate;
    }

    public String getRealEstateAdress() {
        return realEstateAdress;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBuyer(Physical_person buyer) {
        this.buyer = buyer;
    }

    public void setSeller(Physical_person seller) {
        this.seller = seller;
    }

    public void setPriceOfRealEstate(double priceOfRealEstate) {
        this.priceOfRealEstate = priceOfRealEstate;
    }

    public void setRealEstateAdress(String realEstateAdress) {
        this.realEstateAdress = realEstateAdress;
    }

    public double percentageOfEarnings () {
        if (buyer .isPreviouslyPurshased()) {
            return 0.02;
        }
        else {
            return 0.03;
        }
    }


    public double agencyEarnings () {
        return 1000 + this.priceOfRealEstate * this.percentageOfEarnings();
    }
    public void print () {
        System.out.println("Date (" + date + ") a contract was concluded between " + this.seller + " and " + this.buyer
                + " about the purchase of real estate " + this.realEstateAdress + " for the price of " + priceOfRealEstate
        + " whereby the buyer is obliged to pay the agency a monetary value in the amount of " + this.agencyEarnings());
    }
}
