SELECT
    reg_0000.CNPJ
    ,reg_0000.UF
    ,reg_0000.DT_INI AS 'MÊS'
    -- ,`reg_c170`.`ID`
    -- ,`reg_c170`.`REG`
    -- ,`reg_c170`.`ID_PAI`
    -- ,`reg_c170`.`HASHFILE`
    -- ,`reg_c170`.`NUM_ITEM`
    -- ,`reg_c170`.`COD_ITEM`
    ,reg_0200.COD_NCM AS NCM
    -- ,`reg_c170`.`DESCR_COMPL`
    ,FORMAT(SUM(`reg_c170`.`QTD`) , 2, 'pt-br') AS Quantidade
    -- ,`reg_c170`.`UNID`
    ,FORMAT(SUM(`reg_c170`.`VL_ITEM`) , 2, 'pt-br') AS 'Valor Item'
    -- ,`reg_c170`.`VL_DESC`
    -- ,`reg_c170`.`IND_MOV`,
    ,`reg_c170`.`CST_ICMS`
    ,`reg_c170`.`CFOP`
    -- ,`reg_c170`.`COD_NAT`
    -- ,`reg_c170`.`VL_BC_ICMS`
    ,`reg_c170`.`ALIQ_ICMS`
    -- ,`reg_c170`.`VL_ICMS`
    -- ,`reg_c170`.`VL_BC_ICMS_ST`
    -- ,`reg_c170`.`ALIQ_ST`
    -- ,`reg_c170`.`VL_ICMS_ST`
    -- ,`reg_c170`.`IND_APUR`
    -- ,`reg_c170`.`CST_IPI`
    -- ,`reg_c170`.`COD_ENQ`
    -- ,`reg_c170`.`VL_BC_IPI`
    -- ,`reg_c170`.`ALIQ_IPI`
    -- ,`reg_c170`.`VL_IPI`
    -- ,`reg_c170`.`CST_PIS`
    -- ,`reg_c170`.`VL_BC_PIS`
    -- ,`reg_c170`.`ALIQ_PIS_PERC`
    -- ,`reg_c170`.`QUANT_BC_PIS`
    -- ,`reg_c170`.`ALIQ_PIS_REAIS`
    -- ,`reg_c170`.`VL_PIS`
    -- ,`reg_c170`.`CST_COFINS`
    -- ,`reg_c170`.`VL_BC_COFINS`
    -- ,`reg_c170`.`ALIQ_COFINS_PERC`
    -- ,`reg_c170`.`QUANT_BC_COFINS`
    -- ,`reg_c170`.`ALIQ_COFINS_REAIS`
    -- ,`reg_c170`.`VL_COFINS`
    -- ,`reg_c170`.`COD_CTA`
    -- ,`reg_c170`.`VL_ABAT_NT`
FROM `efdicms`.`reg_c170`
    JOIN reg_c100 ON reg_c100.ID          = reg_c170.ID_PAI   AND reg_c100.HASHFILE = reg_c170.HASHFILE
    JOIN reg_c001 ON reg_c001.ID          = reg_c100.ID_PAI   AND reg_c001.HASHFILE = reg_c170.HASHFILE
    JOIN reg_0000 ON reg_0000.ID          = reg_c001.ID_PAI   AND reg_0000.HASHFILE = reg_c170.HASHFILE
    -- JOIN reg_0150 ON reg_0150.COD_PART = reg_c100.COD_PART AND reg_0150.HASHFILE = reg_c170.HASHFILE
    JOIN reg_0200 ON reg_0200.COD_ITEM    = reg_c170.COD_ITEM AND reg_0200.HASHFILE = reg_c170.HASHFILE
WHERE  reg_0000.CNPJ LIKE '59546515004555'
    AND reg_0000.DT_INI BETWEEN '20220601' AND '20220930' -- AAAAmmDD
    
    -- 0 = Entrada; 1 = Saida
    AND reg_c100.IND_OPER = 0

	-- 0 = Emissão própria; 1 = Emissão Terceiro
	AND reg_c100.IND_EMIT = 1
    
    AND reg_c100.COD_SIT = 00
    -- AND reg_c100.VL_ICMS > 0
GROUP BY
    reg_0000.CNPJ
    ,reg_0000.UF
    ,reg_0000.DT_INI
    ,reg_0200.COD_NCM
    ,`reg_c170`.`CST_ICMS`
    ,`reg_c170`.`CFOP`
    ,`reg_c170`.`ALIQ_ICMS`