<?php
echo "Testando conexao <br /> <br />";
# Para testar o mysqldb 192.168.1.14, para testar o mysqlserver 192.168.1.16
# $servername = "192.168.1.14";
$servername = "192.168.1.16";
$username = "phpuser";
$password = "pass";

// Create connection
$conn = new mysqli($servername, $username, $password);

// Check connection
if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}
echo "Conectado com sucesso";
?>