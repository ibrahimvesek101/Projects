package pojo.reqres;

public class UserRequest {

    private User data;

    private Support support;


    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }


    @Override
    public String toString() {
        return "UserRequest{" +
                "data=" + data +
                ", support=" + support +
                '}';
    }
}
