using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace conceitos_poo_2
{
    public interface INotificador
    {
        void EnviarNotificacao(string mensagem);

        bool ValidarDestinatario(string destinatario);

        string TipoNotificacao{get;}
  
    }
}