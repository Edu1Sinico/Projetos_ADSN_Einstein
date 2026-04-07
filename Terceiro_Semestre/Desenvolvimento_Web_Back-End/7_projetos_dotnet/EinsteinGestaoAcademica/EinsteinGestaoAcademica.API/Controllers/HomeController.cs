using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

// End Points - Pontos de extremidade é a porta entre o front-end e o back-end
namespace EinsteinGestaoAcademica.API.Controllers
{
    [Route("api/[controller]")] // Definição da rota "api/Home/hello"
    [ApiController]
    public class HomeController : ControllerBase // Classe HomeController herda de ControllerBase -> Para o caminho da rota, ele ignora o "Controller" do "HomeController" - Permanessendo apenas o "Home"
    {
        [HttpGet("hello")] // Determinação dos verbos: HttpGet = Verbo GET | O "hello" é o nome da rota "/api/Home/hello"
        public IActionResult HelloWorld() // Adiciona uma função para o GET criado -> pode ser visualizado ao executar (response)
        {
            return Ok("Hello, World!");
        }
    }
}

// * ANOTAÇÕES *

// COMUNICAÇÃO ENTRE FRONT E BACK:
// • Comunicação entre Front-End e Back-End é feita através de Requests HTTPS (front-end) e Responses (back-end).
