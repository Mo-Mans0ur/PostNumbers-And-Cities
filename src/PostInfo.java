public class PostInfo {

    private String city;
    private int postNr;

    public PostInfo(int postNr, String city) {
        this.city = city;
        this.postNr = postNr;
    }


    public int getPostNr() {
        return postNr;
    }

    @Override
    public String toString() {
        return "PostNumber: " + postNr + "," + " City:" + city;
    }

}

