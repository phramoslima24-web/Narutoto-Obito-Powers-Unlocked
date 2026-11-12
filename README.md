# Narutoto: Obito Powers Unlocked (código-fonte)

Addon de compatibilidade para **Minecraft 1.20.1 / Forge 47.4.10 / Narutoto 0.4.1**.

## O que altera
O JAR do Narutoto contém os procedimentos de Kamui, mas algumas rotinas restringem o uso ao estado de Sharingan do Obito (`if_sharigan == 2`) e, no clique de ativação, ao proprietário `obito`. O procedimento `SharinganSasukeProcedure` registra `mangekyo_owner` como `sasuke`.

Este addon usa Mixins para tratar o Mangekyo do Sasuke como elegível somente nas verificações internas das rotinas de Kamui. Não troca o item/olho equipado e não altera o valor salvo do jogador.

## Instalação (quando compilado)
1. Mantenha o `narutoto-0_4_1-forge.jar` na pasta `mods`.
2. Coloque o JAR compilado deste addon também na pasta `mods`.
3. Inicie com Minecraft 1.20.1 e Forge 47.4.10.

## Compilar
1. Instale JDK 17 e Gradle 8.x.
2. Copie o JAR original para `libs/narutoto-0_4_1-forge.jar`.
3. Execute `gradle build`.
4. O resultado ficará em `build/libs/narutoto-obito-unlocked-1.0.0.jar`.

## Importante
Este pacote é o **projeto-fonte**, não um JAR pronto para colocar em `mods`. O ambiente desta sessão não tem Gradle/ForgeGradle instalado para resolver as dependências e compilar um mod executável. Teste primeiro em uma cópia do mundo. Se o Narutoto tiver outro build/versão ou se o nome interno do proprietário do Mangekyo for diferente, os pontos de compatibilidade precisarão ser ajustados.
