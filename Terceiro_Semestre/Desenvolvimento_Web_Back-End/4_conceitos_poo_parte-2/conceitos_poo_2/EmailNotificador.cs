using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace conceitos_poo_2
{
    // Classe implementando uma interface
    public class EmailNotificador : INotificador
    {

        // Implementando atributos e métodos da interface
        public string TipoNotificacao => "Email";

        public void EnviarNotificacao(string mensagem)
        {
            Console.WriteLine($"Enviado email: {mensagem}");
        }

        public bool ValidarDestinatario(string destinatario)
        {
            return destinatario.Contains("@");
        }
    }
}