def call() {
  def full_string = "Git1\nGit2"
  def arr = full_string.split("\n")
  for (i in arr) {
    println "now got ${i}"
  }
  println "${full_string}"

  return full_string
}
