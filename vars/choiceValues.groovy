def call() {
  def full_string = "Git1 Git2"
  def arr = full_string.split(" ")
  for (i in arr) {
    println "now got ${i}"
  }

  return arr
}
