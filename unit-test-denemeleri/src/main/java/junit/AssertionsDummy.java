package junit;

import java.util.Objects;

public class AssertionsDummy {


    private int id;

    public int getId() {
        return id;
    }

    public AssertionsDummy(int id) {
        this.id = id;
    }
    public AssertionsDummy(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssertionsDummy that = (AssertionsDummy) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
