package com.scx.excelutil.util;

import com.scx.excelutil.model.*;

/**
 * @author scx
 * @date 2020-09-15 16:40
 * @Description
 */
public class FormComponentFactory {
    public static FormComponent getComponentByType(FormComponentDTO dataSource) {
        FormComponent formComponent = null;
        if (dataSource.getType().equals(ComTypeEnum.PASSWORD.getComType())) {
            formComponent = new PassComponent().build(dataSource);
        } else if (dataSource.getType().equals(ComTypeEnum.AMOUNT.getComType())) {
            formComponent = new AmountComponent().build(dataSource);
        } else if (dataSource.getType().equals(ComTypeEnum.NUMBER.getComType())) {
            formComponent = new NumComponent().build(dataSource);
        } else if (dataSource.getType().equals(ComTypeEnum.DATE.getComType())) {
            formComponent = new DateComponent().build(dataSource);
        } else if (dataSource.getType().equals(ComTypeEnum.SELECT.getComType())) {
            formComponent = new SelectComponent().build(dataSource);
        } else if (dataSource.getType().equals(ComTypeEnum.SINGLETEXT.getComType())) {
            formComponent = new TextComponent().build(dataSource);
        } else if (dataSource.getType().equals(ComTypeEnum.CARD.getComType())) {
            formComponent = new CardComponent().build(dataSource);
        } else {
            formComponent = new FormComponent().build(dataSource);
        }

        return formComponent;
    }
}
