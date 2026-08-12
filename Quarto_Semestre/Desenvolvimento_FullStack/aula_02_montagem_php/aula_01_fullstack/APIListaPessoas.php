<?php
// Conexão ao banco
require_once("dbConnect.php");

// Define a coleção da conexão
mysqli_set_charset($conn, $query);

$query = 'SELECT id,nome,idade FROM pessoas';

// Prepara a consulta
$stmp = mysqli_query($conn, $query);

// Executar e armazenar a query
mysqli_stmt_execute($stmp);
mysqli_stmt_store_result($stmp);

// associa os campos a variáveis
mysqli_stmt_bind_result($stmt, $id, $nome, $idade);

$response = array();

if(mysqli_stmt_num_rows($stmt) > 0){
    while(mysqli_stmt_fetch($stmt)){
        array_push($response, array(
            'id' => $id,
            'nome' => $nome,
            'idade' => $idade
        ));
    }
}

echo json_encode($response);
?>
