USE `efdicms`;
SELECT `reg_d190`.`REG`,
-- `reg_d190`.`CST_ICMS`,
`reg_d190`.`CFOP`,
`reg_d190`.`ALIQ_ICMS`,
-- `reg_d190`.`VL_OPR`,
FORMAT(SUM(`reg_d190`.`VL_OPR`), 2, 'pt-br') AS 'Total',
-- `reg_d190`.`VL_BC_ICMS`,
FORMAT(SUM(`reg_d190`.`VL_BC_ICMS`), 2, 'pt-br') AS 'Base ICMS',
-- `reg_d190`.`VL_ICMS`,
FORMAT(SUM(`reg_d190`.`VL_ICMS`), 2, 'pt-br') AS 'ICMS',
-- `reg_d190`.`VL_RED_BC`,
FORMAT(SUM(`reg_d190`.`VL_RED_BC`), 2, 'pt-br') AS 'Redução'
-- `reg_d190`.`COD_OBS`       
FROM `efdicms`.`reg_d190`
WHERE -- CNPJ LIKE '08046796%' AND
 `HASHFILE` = 'acc65f7bcce41091b42fcf665b3fa828'
 GROUP BY
    `reg_d190`.`ALIQ_ICMS`,
    `reg_d190`.`CFOP`
ORDER BY
    `reg_d190`.`CFOP`,
    `reg_d190`.`ALIQ_ICMS`
 ;
