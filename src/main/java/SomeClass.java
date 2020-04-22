import lombok.Data;
import lombok.With;

@Data
public class SomeClass {

    public final static SomeClass Foo = new SomeClass(SomeEnum.Foo, "default");

    private final SomeEnum flag;

    @With
    private final String text;

}
