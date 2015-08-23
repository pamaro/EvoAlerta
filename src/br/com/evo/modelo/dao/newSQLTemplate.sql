insert into FND_Pessoas(nome_completo,nome_primeiro,nome_ultimo,email,telefone_com,
telefone_cel,telefone_fax,empresa,empresa_id,pais,estado,cidade,login,password,area_nome,
area_id) 
VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,MD5(?),?,?);

SELECT * FROM FND_Pessoas WHERE RequestID = ?;
