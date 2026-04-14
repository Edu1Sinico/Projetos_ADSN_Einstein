using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using EinsteinGestaoAcademica.API.Dominio.Entidades;
using Microsoft.EntityFrameworkCore;

namespace EinsteinGestaoAcademica.API.Data
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options)
       : base(options) { }

        public DbSet<Curso> Cursos { get; set; }
        public DbSet<Usuario> Usuarios { get; set; }

        // Criação da tabela "Curso"
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Curso>(e =>
             {
                 e.ToTable("curso", "public"); // Relaciona a entidade do sistema com a tabela banco de dados
                 e.Ignore(x => x.disciplinas); // Ignora o campo disciplina
                 e.HasKey(x => x.id); // Define a chave primária
             });

            modelBuilder.Entity<Usuario>(e =>
            {
                e.ToTable("usuario", "public");
                e.HasKey(x => x.id);
            });

        }

    }
}