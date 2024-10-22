package tests.interfaces;

/**
 * Интерфейс, справочник содерджащий названия тегов (Tag)
 */
public interface INameTags {

    /**
     * Регрессионное тестирование
     */
    String REGRESS = "regress";

    /**
     * Смоук тестирование
     */
    String SMOKE = "smoke";

    /**
     * Тесты проверяющие сумму значений
     */
    String SUM = "sum";

    /**
     * Тесты проверяющие разницу значений
     */
    String SUBTRACTION = "subtraction";

    /**
     * Тесты проверяющие умножение значений
     */
    String MULTIPLICATION = "multiplication";

    /**
     * Тесты проверяющие деление значений
     */
    String DIVISION = "division";
}
