USE efdicms;
SELECT reg_0000.CNPJ,
    reg_0000.UF,
    reg_0000.DT_INI AS 'MÊS',
    LEFT(reg_0150.COD_MUN,2) AS 'UF Tomador',
    -- reg_d100.REG,
    -- reg_d100.IND_OPER,
    -- reg_d100.IND_EMIT,
    -- reg_d100.COD_PART,
    -- reg_d100.COD_MOD,
    -- reg_d100.COD_SIT,
    -- reg_d100.SER,
    -- reg_d100.SUB,
    -- reg_d100.NUM_DOC,
    -- reg_d100.CHV_CTE,
    -- reg_d100.DT_DOC,
    -- reg_d100.DT_A_P,
    -- reg_d100.TP_CT_E,
    -- reg_d100.CHV_CTE_REF,
    -- reg_d100.VL_DOC,
    FORMAT(SUM(reg_d100.VL_DOC), 2, 'pt_BR') AS 'Total',
    -- reg_d100.VL_DESC,
    FORMAT(SUM(reg_d100.VL_DESC), 2, 'pt_BR') AS 'Desconto',
    -- reg_d100.IND_FRT,
    -- reg_d100.VL_SERV,
    FORMAT(SUM(reg_d100.VL_SERV), 2, 'pt_BR') AS 'Serviço',
    -- reg_d100.VL_BC_ICMS,
    FORMAT(SUM(reg_d100.VL_BC_ICMS), 2, 'pt_BR') AS 'Base ICMS',
    -- reg_d100.VL_ICMS,
    FORMAT(SUM(reg_d100.VL_ICMS), 2, 'pt_BR') AS 'ICMS',
    -- reg_d100.VL_NT,
    FORMAT(SUM(reg_d100.VL_NT), 2, 'pt_BR') AS 'Não Tributado',
    -- reg_d100.COD_INF,
    -- reg_d100.COD_CTA,
    -- reg_d100.COD_MUN_ORIG,
    LEFT(reg_d100.COD_MUN_ORIG,2) AS 'UF Origem',
    -- reg_d100.COD_MUN_DEST
    LEFT(reg_d100.COD_MUN_DEST,2) AS 'UF Destino'
FROM efdicms.reg_d100
    JOIN reg_d001 ON reg_d001.ID          = reg_d100.ID_PAI   AND reg_d001.HASHFILE = reg_d100.HASHFILE
    JOIN reg_0000 ON reg_0000.ID          = reg_d001.ID_PAI   AND reg_0000.HASHFILE = reg_d001.HASHFILE
    JOIN reg_0150 ON reg_0150.COD_PART    = reg_d100.COD_PART AND reg_0150.HASHFILE = reg_d001.HASHFILE
WHERE  reg_0000.CNPJ LIKE '08046796%'
    
    -- AND reg_0000.DT_INI -- BETWEEN '20221101' AND '20221130' -- AAAAmmDD
    -- reg_d100.CHV_CTE = '31210973939449003028570010152757091637306080'
    -- COD_MUN_ORIG IS NULL
	AND reg_d100.COD_MUN_ORIG LIKE '31%' -- 31=MG
	-- AND reg_d100.COD_MUN_DEST  LIKE '31%'
    
    -- AND HASHFILE = '9ab97f27aa66e3bf7e9e90534a7a6b08'

    -- 0 = Entrada; 1 = Saida
    AND reg_d100.IND_OPER = 1

	-- 0 = Emissão própria; 1 = Emissão Terceiro
	-- AND reg_d100.IND_EMIT = 0
    
    AND reg_d100.COD_SIT = 00
    -- AND reg_d100.VL_ICMS > 0
GROUP BY
    reg_0000.CNPJ,
    reg_0000.UF,
    reg_0000.DT_INI,
    LEFT(reg_0150.COD_MUN,2),
    LEFT(reg_d100.COD_MUN_ORIG,2),
    -- reg_d100.COD_MUN_DEST
    LEFT(reg_d100.COD_MUN_DEST,2)
ORDER BY
    reg_0000.CNPJ,
    reg_0000.UF,
    reg_0000.DT_INI
;
