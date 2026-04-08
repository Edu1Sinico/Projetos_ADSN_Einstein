using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using EinsteinGestaoAcademica.API.Dominio.Enums;

namespace EinsteinGestaoAcademica.API.Dominio.Entidades
{
    public class Disciplina
    {
        public string NomeDisciplina {get;set;}
        public Periodo periodo {get;set;} // NÃO É UMA CLASSE! É ENUMERADOR
        public string DiaSemana{get;set;}
    }
}