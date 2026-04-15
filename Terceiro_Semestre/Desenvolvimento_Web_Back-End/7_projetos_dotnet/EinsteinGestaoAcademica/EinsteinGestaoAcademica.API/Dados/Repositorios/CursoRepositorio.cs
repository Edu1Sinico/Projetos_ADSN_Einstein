using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EinsteinGestaoAcademica.API.Dados.Repositorios
{
    public class CursoRepositorio : ICursoRepositorio
    {
        ApplicationDbContext contexto;

        // Cria a instância do ApplicationDbContext da declarado na classe Program.cs
        public CursoRepositorio(ApplicationDbContext contexto)
        {
            this.contexto = contexto;
        }

        public void Atualizar(Curso curso)
        {
            throw new NotImplementedException();
        }
        public void Deletar(Curso curso)
        {
            throw new NotImplementedException();
        }
        public void Inserir(Curso curso)
        {
            contexto.Cursos.Add(curso);
            contexto.SaveChanges();
        }
        public void ObterCurso(int id)
        {
            throw new NotImplementedException();
        }

        public List<Curso> ObterCurso()
        {
            throw new NotImplementedException();
        }
    }
}