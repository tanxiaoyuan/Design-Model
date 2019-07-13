public interface Creator{

    <T extends Product> T create(Class<T> clazz);
}
