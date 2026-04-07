using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace EinsteinGestaoAcademica.API.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class MeuEndPointController : ControllerBase
    {
        // Buscar
        [HttpGet("obter-dados")] // Criando um verbo GET: "obter-dados" - Deve ser aplicado em métodos
        public IActionResult ObterDados() // Método "IActionResult sempre retornar uma resposta (response)
        {
            return Ok("Dados devolvidos"); // Retorna a mensagem e o código de resposta 200 "OK"
        }

        // Criar
        [HttpPost("incluir")]
        public IActionResult Incluir()
        {
            return Created(); // Retorna 201
        }

        // Atualizar
        [HttpPut("atualizar")]
        public IActionResult Atualizar()
        {
            return NoContent(); // Retorna 204
        }

        // Excluir
        [HttpDelete("excluir")]
        public IActionResult Excluir()
        {
            return NoContent(); // Retorna 204
        }

    }
}

// Explicação mais detalhada no construtor "HomeController"

// Obs.: O professor é exigente neste tipo de código (definição dos retornos)
