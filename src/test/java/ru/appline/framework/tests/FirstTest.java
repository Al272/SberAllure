package ru.appline.framework.tests;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import ru.appline.framework.basetestsclass.BaseTests;

public class FirstTest extends BaseTests {

    @Test()
    @DisplayName("Оформление программы страхования для путешественников")
    @Description("Демонстрационный e2e сценарий")
    public void startTest(){
        app.getStartPage()
                .selectBaseMenu("Ипотека")
                .selectSubMenu("Ипотека на готовое жильё")
                .checkOpenPage("Ипотека на готовое жилье — СберБанк")
                .insertParams("5180000","3058000","30")
                .checkRollButton("Страхование жизни и здоровья", false)
                .checkRollButton("Молодая семья", true)
                .checkPayData("Ежемесячный платеж","16017")
                .checkPayData("Сумма кредита","2122000")
                .checkPayData("Необходимый доход","20618")
                .checkPayData("Процентная ставка","11");

    }

}
