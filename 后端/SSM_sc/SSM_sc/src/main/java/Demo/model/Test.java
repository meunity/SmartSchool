package Demo.model;

public class Test {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.Tid
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    private Integer tid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.Tname
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    private String tname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.Turl
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    private String turl;
    private String tcollege;
    public Test() {

    }

    public Test(Integer tid, String tname, String turl, String tcollege) {
        this.tid = tid;
        this.tname = tname;
        this.turl = turl;
        this.tcollege = tcollege;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }

    public String getTcollege() {
        return tcollege;
    }

    public void setTcollege(String tcollege) {
        this.tcollege = tcollege;
    }
}