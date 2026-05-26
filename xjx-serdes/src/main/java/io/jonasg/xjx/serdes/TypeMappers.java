package io.jonasg.xjx.serdes;

import io.jonasg.xjx.serdes.deserialize.XjxDeserializationException;
import io.jonasg.xjx.serdes.deserialize.config.XjxConfiguration;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public final class TypeMappers {

    static List<Class<Double>> DOUBLE_TYPES = List.of(double.class, Double.class);

    static List<Class<Long>> LONG_TYPES = List.of(long.class, Long.class);

    static List<Class<Integer>> INTEGER_TYPES = List.of(int.class, Integer.class);

    static List<Class<Character>> CHAR_TYPES = List.of(char.class, Character.class);

    static List<Class<Boolean>> BOOLEAN_TYPES = List.of(boolean.class, Boolean.class);

    public static Set<Class<?>> TYPES;

    static {
        TYPES = new HashSet<>();
        TYPES.addAll(INTEGER_TYPES);
        TYPES.addAll(DOUBLE_TYPES);
        TYPES.addAll(LONG_TYPES);
        TYPES.addAll(CHAR_TYPES);
        TYPES.addAll(BOOLEAN_TYPES);
        TYPES.add(String.class);
        TYPES.add(LocalDate.class);
    }

    public static Function<Object, Object> forType(Class<?> type, XjxConfiguration configuration) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    private static <T extends Enum<T>> T toEnum(Class<?> type, String value) {
        try {
            T[] enumConstants = (T[]) type.getEnumConstants();
            for (T constant : enumConstants) {
                if (value.equals(constant.name())) {
                    return constant;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
